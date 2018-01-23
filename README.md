# spring-cloud-zuul-demo
A simple Spring Cloud Zuul demo . 

## OAuth2 Server

oauth2 authentication provider

* context-path: /uaa
* serve port: 8804
* client details: in class ``com.cloume.ncee.OAuthConfiguration``

## Resource Server

provide an api ``/test`` saying ``HELLO, WORKS``

## UI-Server(*Also Zuul Gateway*)

* proxy access to ui-server and resource-server
``
/api/** -> http(s)://{resource-server-hostname}
/ -> http(s)://{ui-server-hostname}
``
* homepage: /hello
* users: added in ``ncee-oauth`` project, class ``com.cloume.ncee.NceeAuthServerApplication``
* ui-server(as oauth2 client) may have own user-system

## IMPORTANT

* if ui-server and oauth2-server launched on the same host (even not on the same port), should set one of servers' context-path to anything but ``/``, cuz ``Set-Cookie`` will override each other, make login fail (error log say some CSRF exception, not that). actually JSESSIONID change make the OAuthClientContext re-generated is the real reason

* JWT, symmetric key (123) used in example, un-symmetric one should be better! embedded **.jks** in project, tutorials available on google (or bing.com) and other SE.

good luck!
