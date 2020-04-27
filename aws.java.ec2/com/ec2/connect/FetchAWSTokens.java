package com.ec2.connect;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FetchAWSTokens {
	public static String getToken() throws IOException {
		return (Files.readAllLines(Paths.get(".\\accessToken\\accessToken.nfo")).get(0));
	}

	public static String getAccessToken() throws IOException {
		return (Files.readAllLines(Paths.get(".\\accessToken\\accessToken.nfo")).get(0));
	}
}
