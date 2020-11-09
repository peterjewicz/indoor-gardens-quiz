(ns ^:figwheel-hooks indoor-garden-quiz.core
  (:require
   [goog.dom :as gdom]
   [reagent.core :as reagent :refer [atom]]
   [reagent.dom :as rdom]
   [indoor-garden-quiz.components.questions :refer [question-list]]
   [indoor-garden-quiz.components.question :refer [Question]]))



;; define your app data so that it doesn't get over-written on reload
(defonce app-state (atom {:text "Hello world!"}))

(defn set-answer [])

(defn next-question [])

(defn handle-answer [key]
  (js/alert key))

(defn get-app-element []
  (gdom/getElement "app"))

(defn Quiz []
  [:div
   [Question true (first question-list) handle-answer]])

(defn mount [el]
  (rdom/render [Quiz] el))

(defn mount-app-element []
  (when-let [el (get-app-element)]
    (mount el)))

;; conditionally start your application based on the presence of an "app" element
;; this is particularly helpful for testing this ns without launching the app
(mount-app-element)

;; specify reload hook with ^;after-load metadata
(defn ^:after-load on-reload []
  (mount-app-element))
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)

