package demo

import auth.Role
import auth.User
import auth.UserRole
import grails.converters.JSON


class BootStrap {

    def init = {servletContext -> registerMarshallers() }


    private void registerMarshallers(){
        JSON.registerObjectMarshaller(User) {

            def map = [

                    'id'                        : it.id?:"",
                    'username'                  : it.username?:"",
                    'password'                  : it.password?:"",
            ]
            return map
        }

    }
        /*def adminRole = new Role(authority: 'ROLE_ADMIN').save()

        def testUser = new User(username: 'admin', password: 'pass').save()

        UserRole.create testUser, adminRole

        UserRole.withSession {
            it.flush()
            it.clear()
        }*/

        //assert User.count() == 1
        //assert Role.count() == 1
        //assert UserRole.count() == 1


}