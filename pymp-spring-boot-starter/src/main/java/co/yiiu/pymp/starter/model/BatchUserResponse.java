package co.yiiu.pymp.starter.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class BatchUserResponse extends WechatResponse {

    List<UserInfoResponse> user_info_list;
}
