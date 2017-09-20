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
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@RestController
@RequestMapping(value = "/interface")
public class IUserManagerService {

	@Autowired
	private AccountInfoDao accountInfoDao;

	@Autowired
	private IdentityDao userIdentityDao;

	@Autowired
	@Qualifier("idGeneratorFactory")
	private IDGeneratorFactory generator;

	@RequestMapping(value = "/register" , method = RequestMethod.POST,consumes = "application/json",produces = "application/json; charset=utf-8")
	public UserRegisterResponse register(@PathVariable UserRegisterRequest userRegistRequest) {
		UserRegisterResponse response = new UserRegisterResponse();
		IdentityInfo identityInfo = new IdentityInfo();
		AccountInfo accountInfo = userRegistRequest.getAccountInfo();
		//生成身份标识
		String identityID = generator.get(IDGeneratorEnum.IDENTITY).generate();
		identityInfo.setIdentityID(identityID);
		identityInfo.setCreateTime(new Date());
		identityInfo.setUpdateTime(new Date());

		accountInfo.setIdentityID(identityID);
		accountInfo.setUpdateTime(new Date());

		userIdentityDao.createIdentity(identityInfo);
		accountInfoDao.createAccount(accountInfo);

		response.setIdentityInfo(identityInfo);
		response.setAccountInfo(accountInfo);

		return response;
	}



	public UserAuthResponse authenticate(UserAuthRequest userAuthResquest) {

		return null;
	}

	@RequestMapping(value = "/getUserInfo" , method = RequestMethod.GET)
	public GetUserInfoResponse getUserInfo(@RequestParam("id") String identityID) {

		GetUserInfoResponse response = new GetUserInfoResponse();

		IdentityInfo identityInfo = userIdentityDao.getIdentity(identityID);
		AccountInfo accountInfo = accountInfoDao.getAccount(identityID);

		response.setIdentityInfo(identityInfo);
		response.setAccountInfo(accountInfo);
		return response;
	}

}
