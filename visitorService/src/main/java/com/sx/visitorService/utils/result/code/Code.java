package com.sx.visitorService.utils.result.code;

public interface Code {
	// 成功
	int SUCCESS  = Errs.put(200, "成功");
	// 未知错误
	int ERROR	 = Errs.put(-1, "操作有误");
	// 未知错误
	int LOGIN_OUT	 = Errs.put(-2, "登录失效");
	// 用户名或密码不正确
	int LOGIN_ERROR	 = Errs.put(-3, "用户名或密码不正确");
	//用户不存在
	int NO_EXIST	 = Errs.put(-4, "用户不存在");
    int REGISTER_ERROR =Errs.put(-5, "注册失败"); ;
}
