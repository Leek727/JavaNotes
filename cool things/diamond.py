from time import sleep
import turtle as trtl

diamond = lambda n: ('\n'.join([' '*int(abs(x-(n-1)/2))+('*'*(-2*(abs(x-int((n-1)/2)))+n))for x in range(n)])+'\n')if(n%2==1 and n>0) else None

delay = .1
for x in range(100):
  for i in range(7,43,2):
    print(diamond(i))
    sleep(delay)
    print('\n'*50)
  for i in range(43,7,-2):
    print(diamond(i))
    sleep(delay)
    print('\n'*50)
