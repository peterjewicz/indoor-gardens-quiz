(ns ^:figwheel-hooks indoor-garden-quiz.core
  (:require
   [goog.dom :as gdom]
   [reagent.core :as reagent :refer [atom]]
   [reagent.dom :as rdom]
   [indoor-garden-quiz.components.questions :refer [question-list]]
   [indoor-garden-quiz.components.question :refer [Question]]
   [indoor-garden-quiz.components.progress :refer [Progress]]
   [indoor-garden-quiz.components.results :refer [Results]]))


(def QUESTION_COUNT (count question-list))
;; define your app data so that it doesn't get over-written on reload
(defonce app-state (atom {:answers []}))

(defn set-answer [key]
  (swap! app-state update-in [:answers] merge key))

(defn next-question [])

(defn handle-answer [key]
  (swap! app-state update-in [:answers] merge key))


(defn question-position [answers index]
  (cond
    (and (= index 0) (not (contains? answers index))) "center"
    (contains? answers index) "left"
    (contains? answers (- index 1)) "center"
    :else "right"))

(defn get-app-element []
  (gdom/getElement "quiz"))

(defn Quiz []
  [:div.Quiz
   [Question (question-position (:answers @app-state) 0) (first question-list) handle-answer]
   [Question (question-position (:answers @app-state) 1) (second question-list) handle-answer]
   [Question (question-position (:answers @app-state) 2) (nth question-list 2) handle-answer]
   [Question (question-position (:answers @app-state) 3) (nth question-list 3) handle-answer]
   [Results (if (= QUESTION_COUNT (count (:answers @app-state))) "active" false) (:answers @app-state)]
   [Progress QUESTION_COUNT (count (:answers @app-state))]])

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

