(defn fib-seq [x y]
  (lazy-seq
    (cons x (fib-seq y (+ x y)))
  ))

(println
  (reduce +
    (filter even?
      (take-while #(< % 4000000)
        (fib-seq 1N 2N)))))
