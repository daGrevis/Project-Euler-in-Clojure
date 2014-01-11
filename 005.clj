; 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
;
; What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

(defn evenly-divisible? [n numbers]
  (every? #(zero? (mod n %)) numbers))

(println
  (first
    (let
      [numbers (sort > (range 1 21))
       x (first numbers)]
      (filter
        #(evenly-divisible? % numbers)
        (iterate #(+ x %) x)))))
