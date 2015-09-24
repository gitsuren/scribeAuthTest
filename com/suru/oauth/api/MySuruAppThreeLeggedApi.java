package com.suru.oauth.api;

public class MySuruAppThreeLeggedApi extends DefaultApi10a {

	
	private String requestTokenEndpoint = "https://api.suru.com/scribe/oauth/request_token";
	
	private String accessTokenEndpoint = "https://api.suru.com/scribe/oauth/access_token";

	private String authorizationUrl = "https://suru.auth.com/consentToUseOfData?oauth_token=";
	
	
	@Override
	public String getRequestTokenEndpoint() {
		return requestTokenEndpoint;
	}


	@Override
	public String getAccessTokenEndpoint() {
		return accessTokenEndpoint;
	}


	@Override
	public String getAuthorizationUrl(Token requestToken) {
		return authorizationUrl + requestToken.getToken();
	}

}
