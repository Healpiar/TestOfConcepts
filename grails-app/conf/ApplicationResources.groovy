modules = {
    application {
        resource url:'js/application.js'
    }

    jquery_ui {
        dependsOn 'jquery'
        resource url:'js/jquery-ui-1.10.4.min.js'
    }
}