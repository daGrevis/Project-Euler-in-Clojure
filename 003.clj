; The prime factors of 13195 are 5, 7, 13 and 29.
;
; What is the largest prime factor of the number 600851475143 ?

(defn prime-factors [n]
  (loop [n n divisor 2 factors []]
    (if (< n 2)
      factors
      (if (zero? (mod n divisor))
        (recur (/ n divisor) divisor (conj factors divisor))
        (recur n (inc divisor) factors)))))

(println (apply max (prime-factors 600851475143)))
