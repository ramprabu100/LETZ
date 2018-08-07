package com.bookme.security;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class SecurityFilter implements Filter {

    Authentication authentication = new Authentication();

    public void destroy() {

    }

    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {
        System.out.println("filter is here");
        try {
            final Cookie[] cookies = ((HttpServletRequest) request).getCookies();
            String sessionId = "";

            for (final Cookie ck : cookies) {
                System.out.println(ck.getName() + " " + ck.getValue());
                if (ck.getName().equals("sessionId")) {
                    sessionId = ck.getValue();
                    System.out.println("current session ID" + sessionId);
                }
            }
            System.out.println("current session ID" + sessionId);
            if (authentication.validateSessionID(sessionId)) {

                chain.doFilter(request, response);
            }
        } catch (final Exception e) {
            final RequestDispatcher rd = request.getRequestDispatcher("/login");
            rd.include(request, response);
        }
    }

    public void init(final FilterConfig config) throws ServletException {

    }

}
