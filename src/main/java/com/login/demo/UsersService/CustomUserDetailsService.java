//package com.login.demo.UsersService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import com.login.demo.model.User;
//import com.login.demo.model.UserList;
// 
//public class CustomUserDetailsService implements UserDetailsService {
// 
//    @Autowired
//    private UserlistImpl users;
//     
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserList user = users.findByName(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        return new CustomUserDetails(user);
//    }
// 