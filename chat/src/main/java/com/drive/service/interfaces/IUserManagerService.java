package com.drive.service.interfaces;

import com.drive.service.domain.request.UserAuthRequest;
import com.drive.service.domain.request.UserRegisterRequest;
import com.drive.service.domain.response.GetUserInfoResponse;
import com.drive.service.domain.response.UserAuthResponse;
import com.drive.service.domain.response.UserRegisterResponse;
import com.drive.service.generator.IDGeneratorEnum;
import com.drive.service.generator.IDGeneratorFactory;
import com.drive.service.repository.dao.AccountInfoDao;
import com.drive.service.repository.dao.IdentityDao;
import com.drive.service.repository.entity.AccountInfo;
import com.drive.service.repository.entity.IdentityInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class IUserManagerService {

	@Autowired
	private AccountInfoDao accountInfoDao;

	@Autowired
	private IdentityDao userIdentityDao;

	@Autowired
	@Qualifier("idGengeratorFactory")
	private IDGeneratorFactory generator;

	@RequestMapping(value = "/interface/register" , method = RequestMethod.POST)
	public UserRegisterResponse register(UserRegisterRequest userRegistRequest) {
		UserRegisterResponse response = new UserRegisterResponse();
		IdentityInfo identityInfo = userRegistRequest.getIdentityInfo();
		AccountInfo accountInfo = userRegistRequest.getAccountInfo();
		//生成身份标识
		String identityID = generator.get(IDGeneratorEnum.IDENTITY).generate();
		identityInfo.setIdentityID(identityID);
		identityInfo.setCreateTime(new Date());
		identityInfo.setUpdateTime(new Date());

		accountInfo.setIdentityID(identityID);

		userIdentityDao.createIdentity(identityInfo);
		accountInfoDao.createAccount(accountInfo);

		response.setIdentityInfo(identityInfo);
		response.setAccountInfo(accountInfo);

		return response;
	}



	public UserAuthResponse authenticate(UserAuthRequest userAuthResquest) {

		return null;
	}

	@RequestMapping(value = "/interface/getUserInfo" , method = RequestMethod.GET)
	public GetUserInfoResponse getUserInfo(@RequestParam("id") String identityID) {


		return null;
	}

}
