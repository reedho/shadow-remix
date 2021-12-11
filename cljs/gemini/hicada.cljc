(ns gemini.hicada
  #?(:cljs (:require-macros [gemini.hicada :refer [html]]))
  (:require #?(:clj [hicada.compiler])
            #?@(:cljs [["react" :as React]
                       ["react-dom" :as ReactDom]])))

#?(:cljs
   (def h React/createElement))

#?(:clj
   (defmacro html
     [body]
     (hicada.compiler/compile body {:create-element  'gemini.hicada/h
                                    :rewrite-for?    true
                                    :array-children? false})))
