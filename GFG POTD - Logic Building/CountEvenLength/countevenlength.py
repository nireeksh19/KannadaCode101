import math
mod=1000000007
class Solution:
	def compute_value(self, n):
		# Code here
		num=math.factorial(2*n)
		den=math.factorial(n)**2
		return(num//den)%mod