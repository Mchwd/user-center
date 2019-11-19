package com.yuejiji.bankcard.commons;



import com.yuejiji.bankcard.BaseResult.BaseResult;
import com.yuejiji.bankcard.domain.vo.BankCardVo;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;


@RestControllerAdvice
public class CommonResult implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
         if(o==null){
             return BaseResult.fail("该用户没有绑定银行卡");
         }else if(o instanceof BankCardVo){
             if(((BankCardVo) o).getId()==null) {
                 return BaseResult.fail("未知原因出错，请重试");
             }else {
                 return BaseResult.success(o);
             }
         }else {
             return BaseResult.success(o);
         }

    }
}
