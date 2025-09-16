class Solution:
    def validStrings(self, n: int) -> List[str]:
        
        def backtrack(n, store, res):
            if n == len(store):
                res.append(store)
                return
            if store and store[-1] == "0":
                backtrack(n, store + "1", res)
            else:
                backtrack(n, store + "0", res)
                backtrack(n, store + "1", res)
            
        res = []
        backtrack(n, "", res)
        return res