package com.shop_online.convert;

import com.shop_online.entity.User;
import com.shop_online.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author 86187
 * @Date 2023/11/28
 */
@Mapper
public interface UserConvert {
    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    List<UserVO> convertToUserVOList(List<User> userList);
}
