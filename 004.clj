; A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
;
; Find the largest palindrome made from the product of two 3-digit numbers.

(defn palindrome? [n]
  (=(clojure.string/reverse (str n)) (str n)))

(println
  (apply max
    (for [x (range 100 1000) y (range 100 1000)
          :let [z (* x y)]
          :when (palindrome? z)]
      z)))
