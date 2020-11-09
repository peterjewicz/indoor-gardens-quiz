(ns indoor-garden-quiz.components.question)



(defn Question [active details on-click-handler]
  [:div.Question
   [:h2.Question__title (:question details)]
   (for [answer (:answers details)]
     [:div.Question__answers {:key (:key answer) :on-click #(on-click-handler (:key answer))}
      [:p (:value answer)]])])
