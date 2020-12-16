(ns indoor-garden-quiz.components.plants)


(def eat-options
  {:SMALL {
           :LOW {
                 :LOW "Kale"
                 :MEDIUM "Lettuce"
                 :HIGH "Broccoli"}
           :PARTIAL {
                     :LOW "Beets"
                     :MEDIUM "Green Onions"
                     :HIGH "Lemon Tree"}
           :FULL {
                  :LOW "Blackberries"
                  :MEDIUM "Stawberries"
                  :HIGH "Tomatoes"}}
   :MEDIUM {
            :LOW {
                  :LOW "Lettuce"
                  :MEDIUM "Kale"
                  :HIGH "Broccolli"}
            :PARTIAL {
                      :LOW "Beets"
                      :MEDIUM "Garlic"
                      :HIGH "Lemon Tree"}
            :FULL {
                   :LOW "Fruit Trees"
                   :MEDIUM "Cucumbers"
                   :HIGH "Tomatoes"}}
   :LARGE {
            :LOW {
                  :LOW "Lettuce"
                  :MEDIUM "Kale"
                  :HIGH "Broccolli"}
            :PARTIAL {
                      :LOW "Onions"
                      :MEDIUM "Garlic"
                      :HIGH "Fruit Trees"}
            :FULL {
                   :LOW "Scallions"
                   :MEDIUM "Eggplants"
                   :HIGH "Watermellowns"}}})

(def cook-options
  {:SMALL {
           :LOW {
                 :LOW "Chives"
                 :MEDIUM "Mint"
                 :HIGH "Cilantro"}
           :PARTIAL {
                     :LOW "Thyme"
                     :MEDIUM "Chives"
                     :HIGH "Mint"}
           :FULL {
                  :LOW "Basil"
                  :MEDIUM "Dill"
                  :HIGH "Rosemary"}}
   :MEDIUM {
            :LOW {
                  :LOW "Mint"
                  :MEDIUM "Chives"
                  :HIGH "Cilantro"}
            :PARTIAL {
                      :LOW "Parsely"
                      :MEDIUM "Green Onions"
                      :HIGH "Dill"}
            :FULL {
                   :LOW "Basil"
                   :MEDIUM "Dill"
                   :HIGH "Rosemary"}}
   :LARGE {
            :LOW {
                  :LOW "Cilantro"
                  :MEDIUM "Chives"
                  :HIGH "Mint"}
            :PARTIAL {
                      :LOW "Parsely"
                      :MEDIUM "Green Onions"
                      :HIGH "Dill"}
            :FULL {
                   :LOW "Basil"
                   :MEDIUM "Dill"
                   :HIGH "Rosemary"}}})

(def look-options
  {:SMALL {
           :LOW {
                 :LOW "Peace Lillies"
                 :MEDIUM "Spider Plant"
                 :HIGH "Bird Of Paradise"}
           :PARTIAL {
                     :LOW "Golden Pathos"
                     :MEDIUM "Ferns"
                     :HIGH "Lucky Bamboo"}
           :FULL {
                  :LOW "Succulents"
                  :MEDIUM "Succulents"
                  :HIGH "Orchids"}}
   :MEDIUM {
            :LOW {
                  :LOW "Peace Lillies"
                  :MEDIUM "Spider Plant"
                  :HIGH "Bird Of Paradise"}
            :PARTIAL {
                      :LOW "Golden Pathos"
                      :MEDIUM "Ferns"
                      :HIGH "Lucky Bamboo"}
            :FULL {
                   :LOW "Succulents"
                   :MEDIUM "Succulents"
                   :HIGH "Orchids"}}
   :LARGE {
            :LOW {
                  :LOW "Peace Lillies"
                  :MEDIUM "Spider Plant"
                  :HIGH "Bird Of Paradise"}
            :PARTIAL {
                      :LOW "Golden Pathos"
                      :MEDIUM "Ferns"
                      :HIGH "Lucky Bamboo"}
            :FULL {
                   :LOW "Succulents"
                   :MEDIUM "Succulents"
                   :HIGH "Orchids"}}})

(def plant-list
  {
   :EAT   eat-options
   :COOK  cook-options
   :LOOKS look-options})


