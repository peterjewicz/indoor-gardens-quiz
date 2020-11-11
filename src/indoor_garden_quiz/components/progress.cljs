(ns indoor-garden-quiz.components.progress)

(def PROGRESS-WIDTH 200)

(defn set-progress-width [questionCount answerCount]
  (let [answer-to-length (/ PROGRESS-WIDTH questionCount)]
    (* answer-to-length answerCount)))

(defn Progress [questionCount answerCount]
  [:div.Progress {:style {:width (str PROGRESS-WIDTH "px")}}
   [:div.Progress__inner {:style {:width (set-progress-width questionCount answerCount)}}]])
