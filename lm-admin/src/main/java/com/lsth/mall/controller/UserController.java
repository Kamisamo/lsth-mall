package com.lsth.mall.controller;

import com.lsth.mall.entity.TbUser;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author Hxtech
 * @version V1.0
 * @description
 * @create-date 2018/11/2.
 * @modifier
 * @modifier-data
 */
@RestController
@RequestMapping("/users")
public class UserController {

    static Map<Long, TbUser> users = Collections.synchronizedMap(new HashMap<Long, TbUser>());//ConcurrentHashMap区别

    @ApiOperation(value = "获取用户列表", notes = "用户列表")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<TbUser> getUserList() {
        Collection<TbUser> values = users.values();
        ArrayList<TbUser> TbUsers = new ArrayList<>(values);
        return TbUsers;
    }

    /**
     * 处理"/users/"的POST请求，用来创建User
     * 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
     *
     * @param user
     * @return
     */
    @ApiOperation(value = "创建用户", notes = "根据用户对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "TbUser")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addUser(@ModelAttribute TbUser user) {
        users.put(user.getId(), user);
        return "success";
    }

    @ApiOperation(value = "更新用户信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "TbUser")})
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUserById(@PathVariable Long id, @ModelAttribute TbUser user) {
        TbUser TbUser = users.get(id);
//        TbUser.setAge(user.getAge());
//        TbUser.setName(user.getName());
        users.put(id, TbUser);
        return "success";
    }

    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TbUser getUserById(@PathVariable Long id) {
        TbUser TbUser = users.get(id);
        return TbUser;
    }

    @ApiOperation(value = "删除用户", notes = "根据url的id删除用户")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delUserById(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }
}
