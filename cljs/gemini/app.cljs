(ns gemini.app
  (:require [gemini.hicada :refer [html]]
            ["react" :refer [createElement]]
            ["react-dom" :refer [render]]))


(defn App
  []
  (html
    [:div
     [:h1 "Cheers"]
     [:p "Let make this great!"]]))

(defn mount []
  (render (createElement App)
          (js/document.getElementById "root")))

(defn init []
  (println "Bismillah..")
  (mount))
