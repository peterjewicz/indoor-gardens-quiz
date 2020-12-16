(ns indoor-garden-quiz.components.results
  (:require [indoor-garden-quiz.components.plants :refer [plant-list]]))



(defn Results [position answers]
  [:div.Results {:class position}
   [:h2 (get-in plant-list (map #(keyword %) answers))]])
