package com.ec2.connect;

import java.io.IOException;

import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;

public class AWSConnection {
	
	public static AmazonEC2 getConnection() {
		AWSCredentials credentials = null;
		AmazonEC2 ec2AWS = null;
		try {
			credentials = new BasicAWSCredentials(FetchAWSTokens.getToken(), FetchAWSTokens.getAccessToken());
			ec2AWS = AmazonEC2ClientBuilder
					.standard()
					.withCredentials(new AWSStaticCredentialsProvider(credentials))
					.withRegion(Regions.US_EAST_1)
					.build();
			System.out.println("Connection Successful");
		} catch (SdkClientException | IOException sce) {
			System.out.println("Unable to connect, Check your credentials");
			sce.printStackTrace();
		}
		return ec2AWS;
		
	}
	
}
