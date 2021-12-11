(ns gemini.index
  (:refer-clojure :exclude [meta])
  (:require ["remix" :refer [useLoaderData json Link]]
            ["react" :rename {createElement h}]
            [gemini.hicada :refer [html]]))

(defn loader []
  (let [data #js ["a" "b" "c" "d"]]
    (json data)))

(defn meta []
  #js {:title       "Shadow Remix"
       :description "Welcome to remix!"})

(defn Index []
  (let [data (useLoaderData)]
    (html
      [:div
       [:h2 "ShadowCljs ❤ Remix"]
       [:ul
        (for [x data]
          [:li {:key x} (str "data: " x)])]])))
