(ns acme.server)

(defn handler [req]
  {:status 200
   :headers {"content-type" "text/plain"}
   :body "Hello Shadow-World!"})
