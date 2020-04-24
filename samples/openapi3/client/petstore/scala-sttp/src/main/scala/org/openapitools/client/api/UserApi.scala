/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.User
import org.openapitools.client.core._
import alias._
import sttp.client._
import sttp.model.Method

object UserApi {

  def apply(baseUrl: String = "http://petstore.swagger.io/v2")(implicit serializer: SttpSerializer) = new UserApi(baseUrl)
}

class UserApi(baseUrl: String)(implicit serializer: SttpSerializer) {

  import Helpers._
  import serializer._

  /**
   * This can only be done by the logged in user.
   * 
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
   * Available security schemes:
   *   auth_cookie (apiKey)
   * 
   * @param user Created user object
   */
  def createUser(user: User)(implicit apiKey: ApiKeyValue): ApiRequestT[Unit] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/user")
      .contentType("application/json")
      .cookie("AUTH_KEY", apiKey.value)
      .body(user)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
   * Available security schemes:
   *   auth_cookie (apiKey)
   * 
   * @param user List of user object
   */
  def createUsersWithArrayInput(user: Seq[User])(implicit apiKey: ApiKeyValue): ApiRequestT[Unit] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/user/createWithArray")
      .contentType("application/json")
      .cookie("AUTH_KEY", apiKey.value)
      .body(user)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
   * Available security schemes:
   *   auth_cookie (apiKey)
   * 
   * @param user List of user object
   */
  def createUsersWithListInput(user: Seq[User])(implicit apiKey: ApiKeyValue): ApiRequestT[Unit] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/user/createWithList")
      .contentType("application/json")
      .cookie("AUTH_KEY", apiKey.value)
      .body(user)
      .response(asJson[Unit])

  /**
   * This can only be done by the logged in user.
   * 
   * Expected answers:
   *   code 400 :  (Invalid username supplied)
   *   code 404 :  (User not found)
   * 
   * Available security schemes:
   *   auth_cookie (apiKey)
   * 
   * @param username The name that needs to be deleted
   */
  def deleteUser(username: String)(implicit apiKey: ApiKeyValue): ApiRequestT[Unit] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/user/${username}")
      .contentType("application/json")
      .cookie("AUTH_KEY", apiKey.value)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 200 : User (successful operation)
   *   code 400 :  (Invalid username supplied)
   *   code 404 :  (User not found)
   * 
   * @param username The name that needs to be fetched. Use user1 for testing.
   */
  def getUserByName(username: String): ApiRequestT[User] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/user/${username}")
      .contentType("application/json")
      .response(asJson[User])

  /**
   * Expected answers:
   *   code 200 : String (successful operation)
   *              Headers :
   *                Set-Cookie - Cookie authentication key for use with the `auth_cookie` apiKey authentication.
   *                X-Rate-Limit - calls per hour allowed by the user
   *                X-Expires-After - date in UTC when toekn expires
   *   code 400 :  (Invalid username/password supplied)
   * 
   * @param username The user name for login
   * @param password The password for login in clear text
   */
  def loginUser(username: String, password: String): ApiRequestT[String] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/user/login?username=$username&password=$password")
      .contentType("application/json")
      .response(asJson[String])

  /**
   * Expected answers:
   *   code 0 :  (successful operation)
   * 
   * Available security schemes:
   *   auth_cookie (apiKey)
   */
  def logoutUser()(implicit apiKey: ApiKeyValue): ApiRequestT[Unit] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/user/logout")
      .contentType("application/json")
      .cookie("AUTH_KEY", apiKey.value)
      .response(asJson[Unit])

  /**
   * This can only be done by the logged in user.
   * 
   * Expected answers:
   *   code 400 :  (Invalid user supplied)
   *   code 404 :  (User not found)
   * 
   * Available security schemes:
   *   auth_cookie (apiKey)
   * 
   * @param username name that need to be deleted
   * @param user Updated user object
   */
  def updateUser(username: String, user: User)(implicit apiKey: ApiKeyValue): ApiRequestT[Unit] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/user/${username}")
      .contentType("application/json")
      .cookie("AUTH_KEY", apiKey.value)
      .body(user)
      .response(asJson[Unit])

}
