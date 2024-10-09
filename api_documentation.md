
# group11Capstone API Documentation 

## Table of Contents
- [group11Capstone API Documentation](#group11capstone-api-documentation)
  - [Table of Contents](#table-of-contents)
  - [User Management](#user-management)
    - [User Login](#user-login)
    - [Get User Information](#get-user-information)
    - [Get User List](#get-user-list)
    - [Add User](#add-user)
    - [Delete User](#delete-user)
    - [Update User Information](#update-user-information)
  - [Role Management](#role-management)
    - [Get Role List](#get-role-list)
    - [Add Role](#add-role)
    - [Delete Role](#delete-role)
    - [Update Role Information](#update-role-information)
  - [Permission Management](#permission-management)
    - [Get Permission List](#get-permission-list)
    - [Add Permission](#add-permission)

## User Management

### User Login
- **URL**: `/login`
- **Request Method**: `POST`
- **Request Parameters**:
  - `username` (string): Username
  - `password` (string): Password
- **Response Example**:
  ```json
  {
    "token": "eyJhbGciOiJIUzUxMiJ9..."
  }
  ```

### Get User Information
- **URL**: `/getInfo`
- **Request Method**: `GET`
- **Request Parameters**: None
- **Response Example**:
  ```json
  {
    "user": {
      "userId": 1,
      "username": "admin",
      "roles": ["admin"]
    },
    "permissions": ["*:*:*"]
  }
  ```

### Get User List
- **URL**: `/system/user/list`
- **Request Method**: `GET`
- **Request Parameters**:
  - `pageNum` (integer): Current page number
  - `pageSize` (integer): Records per page
  - `userName` (string): Username (optional)
- **Response Example**:
  ```json
  {
    "total": 100,
    "rows": [
      {
        "userId": 1,
        "userName": "admin",
        "status": "0"
      },
      {
        "userId": 2,
        "userName": "test",
        "status": "1"
      }
    ]
  }
  ```

### Add User
- **URL**: `/system/user`
- **Request Method**: `POST`
- **Request Parameters**:
  - `userName` (string): Username
  - `password` (string): Password
  - `email` (string): Email Address
  - `phonenumber` (string): Phone Number
  - `roleIds` (array of integers): Role ID array
- **Response Example**:
  ```json
  {
    "msg": "Operation successful",
    "code": 200
  }
  ```

### Delete User
- **URL**: `/system/user/{userId}`
- **Request Method**: `DELETE`
- **Request Parameters**: 
  - `userId` (integer): User ID
- **Response Example**:
  ```json
  {
    "msg": "Operation successful",
    "code": 200
  }
  ```

### Update User Information
- **URL**: `/system/user/{userId}`
- **Request Method**: `PUT`
- **Request Parameters**:
  - `userId` (integer): User ID
  - `userName` (string): Username
  - `email` (string): Email Address
  - `phonenumber` (string): Phone Number
- **Response Example**:
  ```json
  {
    "msg": "Update successful",
    "code": 200
  }
  ```

## Role Management

### Get Role List
- **URL**: `/system/role/list`
- **Request Method**: `GET`
- **Request Parameters**: None
- **Response Example**:
  ```json
  {
    "roles": [
      {
        "roleId": 1,
        "roleName": "Administrator"
      },
      {
        "roleId": 2,
        "roleName": "Regular User"
      }
    ]
  }
  ```

### Add Role
- **URL**: `/system/role`
- **Request Method**: `POST`
- **Request Parameters**:
  - `roleName` (string): Role Name
  - `roleKey` (string): Role Permission Key
- **Response Example**:
  ```json
  {
    "msg": "Add successful",
    "code": 200
  }
  ```

### Delete Role
- **URL**: `/system/role/{roleId}`
- **Request Method**: `DELETE`
- **Request Parameters**: 
  - `roleId` (integer): Role ID
- **Response Example**:
  ```json
  {
    "msg": "Delete successful",
    "code": 200
  }
  ```

### Update Role Information
- **URL**: `/system/role/{roleId}`
- **Request Method**: `PUT`
- **Request Parameters**:
  - `roleId` (integer): Role ID
  - `roleName` (string): Role Name
  - `roleKey` (string): Role Permission Key
- **Response Example**:
  ```json
  {
    "msg": "Update successful",
    "code": 200
  }
  ```

## Permission Management

### Get Permission List
- **URL**: `/system/permission/list`
- **Request Method**: `GET`
- **Request Parameters**: None
- **Response Example**:
  ```json
  {
    "permissions": [
      {
        "permissionId": 1,
        "permissionName": "View User"
      },
      {
        "permissionId": 2,
        "permissionName": "Edit User"
      }
    ]
  }
  ```

### Add Permission
- **URL**: `/system/permission`
- **Request Method**: `POST`
- **Request Parameters**:
  - `permissionName` (string): Permission Name
  - `permissionKey` (string): Permission Key
- **Response Example**:
  ```json
  {
    "msg": "Add successful",
    "code": 200
  }
  ```
