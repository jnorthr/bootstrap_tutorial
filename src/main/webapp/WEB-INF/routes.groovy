get "/", forward: "index.html", cache: 45.minutes
get "/date", forward: "/datetime.groovy", cache: 10.seconds
get "/readme", forward: "read.html", cache: 2.minutes
get "/film", forward: "carousel.html", cache: 2.minutes
get "/ajax", forward: "ajax.html"
get "/reply", forward: "/ajax.groovy"
