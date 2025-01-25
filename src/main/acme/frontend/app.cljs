(ns acme.frontend.app
  (:require
   [reagent.core :as r]
   [reagent.dom.client :as rdom]))

(defn app []
  [:h1 "Hello, Ted!"])

(defn app-element []
  (js/document.getElementById "root"))

(defonce root (rdom/create-root (app-element)))

(defn ^:export init
  "Run application startup logic."
  []
  (.render root (r/as-element [app])))

(defn ^:dev/after-load re-render
  []
  ;; The `:dev/after-load` metadata causes this function to be called
  ;; after shadow-cljs hot-reloads code.
  ;; This function is called implicitly by its annotation.
  (init))

