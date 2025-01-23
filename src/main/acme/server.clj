(ns acme.server
  (:require
   [ring.middleware.file :as ring-file]
   [ring.middleware.file-info :as ring-file-info]))

(defn my-handler [req]
  {:status 200
   :headers {"content-type" "text/plain"}
   :body "Hello World!"})

(def handler
  (-> my-handler
      (ring-file/wrap-file "public")
      (ring-file-info/wrap-file-info)))
