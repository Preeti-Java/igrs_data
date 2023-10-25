/**
 * 
 */
package com.cg.neel.igrs.users.jwtconfiguration;

import java.io.IOException;
import java.security.Key;

import javax.crypto.spec.SecretKeySpec;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;


/**
 * @author Preeti
 * @Des Used for return all type of token
 *
 */

public class JwtTokenValidatorFilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String jwt = request.getHeader(SecurityConstants.JWT_HEADER);
		if(null != jwt) {
			try {
				// for retrieving any information from token we will need the secret key
				Claims claims = getAllClaimsFromToken(jwt);
				
				String username = String.valueOf(claims.get("username"));
				String authorities = String.valueOf(claims.get("authorities"));
				Authentication authentication = new UsernamePasswordAuthenticationToken(username, null, AuthorityUtils.commaSeparatedStringToAuthorityList(authorities));
				SecurityContextHolder.getContext().setAuthentication(authentication);
				
			}
			catch(Exception e) {
				throw new BadCredentialsException("Invalid/Expired Token Received");
			}
		}
		filterChain.doFilter(request, response);
		
	}
	
	// for retrieving any information from token we will need the secret key
		private Claims getAllClaimsFromToken(String token) {
			return Jwts.parser().setSigningKey(SecurityConstants.JWT_KEY.getBytes()).parseClaimsJws(token).getBody();
		}

		
	/**
	 * @return key
	 */
	private Key getSignUpKey() {
		return new SecretKeySpec(SecurityConstants.JWT_KEY.getBytes(), io.jsonwebtoken.SignatureAlgorithm.ES256.getJcaName());

	}
	
	@Override
	protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
		return request.getServletPath().equals("/login/user") || request.getServletPath().equals("/header/default");
	}


	
}
