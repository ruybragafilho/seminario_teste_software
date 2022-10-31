// Create a WireMock client instance to talk to this API
WireMock wm = new WireMockBuilder()
      .scheme("https")
      .host("y994z.mocklab.io")
      .port(443)
      .authenticator(new ClientAuthenticator() {
          @Override
          public List<HttpHeader> generateAuthHeaders() {
              return Collections.singletonList(new HttpHeader("Authorization", "Token 0430e32e6d249d05b754b9abfe34a15e"));
          }
      })
      .build();


// Configure a stub
wm.register(get(urlEqualTo("/hello-world"))
  .willReturn(aResponse().withBody("Hi!"))); Wire {
    
}
