package com.example.my.roomlivedatatutorial;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J!\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\'\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u000b\u001a\u00020\fH\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\u000fH\'J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\'J!\u0010\u0013\u001a\u00020\u00032\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\'\u00a2\u0006\u0002\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/example/my/roomlivedatatutorial/UserDao;", "", "deleteAllUsers", "", "deleteUsers", "users", "", "Lcom/example/my/roomlivedatatutorial/User;", "([Lcom/example/my/roomlivedatatutorial/User;)V", "findUserWithName", "", "search", "", "getAllUsers", "getAllUsersLiveData", "Landroidx/lifecycle/LiveData;", "getUser", "id", "", "insertUsers", "app_debug"})
public abstract interface UserDao {
    
    @androidx.room.Insert()
    public abstract void insertUsers(@org.jetbrains.annotations.NotNull()
    com.example.my.roomlivedatatutorial.User... users);
    
    @androidx.room.Delete()
    public abstract void deleteUsers(@org.jetbrains.annotations.NotNull()
    com.example.my.roomlivedatatutorial.User... users);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from user")
    public abstract java.util.List<com.example.my.roomlivedatatutorial.User> getAllUsers();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from user")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.my.roomlivedatatutorial.User>> getAllUsersLiveData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from user where id= :id")
    public abstract com.example.my.roomlivedatatutorial.User getUser(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from user where firstName LIKE :search OR lastName LIKE :search")
    public abstract java.util.List<com.example.my.roomlivedatatutorial.User> findUserWithName(@org.jetbrains.annotations.NotNull()
    java.lang.String search);
    
    @androidx.room.Query(value = "DELETE from user")
    public abstract void deleteAllUsers();
}