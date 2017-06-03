package demo

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		
		"/users"(controller:"user",action:"index",method: "GET")
        "/users"(controller:"user",action:"save",method: 'POST')
        "/users"(controller:"user",action:"update",method: 'PUT')

        "/"( view:"/index")

        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
