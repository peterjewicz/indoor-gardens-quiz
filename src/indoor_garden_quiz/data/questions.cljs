(ns indoor-garden-quiz.components.questions)



(def question-list
  [{:question "Why Do You Want To Grow?" :answers [{:key "EAT" :value "To Eat"} {:key "COOK" :value "To Cook With"} {:key "LOOKS" :value "For Looks"} {:key "NA" :value "Just For Fun"}]}
   {:question "How Much Space Do You Have To Grow?" :answers [{:key "SMALL" :value "A Windowsill"} {:key "MEDIUM" :value "A Table's Worth"} {:key "LARGE" :value "An Entire Room"}]}
   {:question "How Much Sun Does Your Space Get?" :answers [{:key "LOW" :value "Not Much At All"} {:key "PARTIAL" :value "A Little During The Day"} {:key "FULL" :value "Lots All Day"}]}
   {:question "How Much Effort Do You Want To Put In?" :answers [{:key "LOW" :value "Once Or Twice A Week"} {:key "MEDIUM" :value "Every Few Days"} {:key "HIGH" :value "Everyday!"}]}])
