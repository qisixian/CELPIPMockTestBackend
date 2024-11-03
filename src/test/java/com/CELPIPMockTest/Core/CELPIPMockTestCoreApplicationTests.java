package com.CELPIPMockTest.Core;

import com.CELPIPMockTest.Core.auth.UserMapper;
import com.CELPIPMockTest.Core.common.MediaFilesMapper;
import com.CELPIPMockTest.Core.reading.ReadingArticles;
import com.CELPIPMockTest.Core.reading.ReadingArticlesMapper;
import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.MACSigner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.security.SecureRandom;
import java.text.ParseException;

import static org.junit.Assert.assertTrue;

@SpringBootTest
class CELPIPMockTestCoreApplicationTests {


	@Autowired
	ReadingArticlesMapper readingArticlesMapper;

	@Test
	void testReadingArticlesMapper() {

		ReadingArticles readingArticle = readingArticlesMapper.getReadingArticleById(111);

		System.out.println(readingArticle);
	}

	@Autowired
	MediaFilesMapper mediaFilesMapper;

	@Test
	void testMediaFilesMapper() {

		System.out.println(mediaFilesMapper.getMediaFileById(2));

	}

	@Autowired
	UserMapper userMapper;

	@Test
	void tesUserMapper() {

		System.out.println(userMapper.getUserByUsername("sixianqi"));
		System.out.println(userMapper.getUserById(1L));

	}


	@Autowired
	private PasswordEncoder passwordEncoder;

	@Test
	void testBCryptPasswordEncoder() {
		 String encodedPassword1 = passwordEncoder.encode("123456");
		 String encodedPassword2 = passwordEncoder.encode("123456");
		 System.out.println(encodedPassword1);
		 System.out.println(encodedPassword2);
		 assertTrue(passwordEncoder.matches("123456", encodedPassword1));
		 assertTrue(passwordEncoder.matches("123456", encodedPassword2));
	}


	@Test
	void testJWT() throws JOSEException, ParseException {
		// Create an HMAC-protected JWS object with a string payload
		JWSObject jwsObject = new JWSObject(new JWSHeader(JWSAlgorithm.HS256),
				new Payload("Hello, world!"));

		System.out.println(jwsObject.getState());


		// We need a 256-bit key for HS256 which must be pre-shared
		byte[] sharedKey = new byte[32];
		new SecureRandom().nextBytes(sharedKey);


		// Apply the HMAC to the JWS object
		jwsObject.sign(new MACSigner(sharedKey));

		// Output in URL-safe format
		System.out.println(jwsObject.serialize());

		System.out.println(jwsObject.getState());


		System.out.println(jwsObject.getPayload());

		System.out.println(JWSObject.parse(jwsObject.serialize()).getPayload());
	}
}
