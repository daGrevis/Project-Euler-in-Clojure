; By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
;
; What is the 10 001st prime number?

(defn prime? [n]
  (cond
    (< n 2) false
    (< n 4) true
    :else (empty? (filter #(zero? (mod n %)) (range 2 (inc (Math/sqrt n)))))))

(println (nth (filter prime? (iterate inc 1)) 10000))
