'''
inputs = '&&&&&&, 456
&&&&&&,&, 1000000
$&&&&, 123
*$&&&&, 123
&&&&-, -123'

You can start with one line of input, then you shall be able to use the sample input to solve
'''

in1 = '&&&&&&, 456'
splitlist=in1.split(", ")
format_str = splitlist[0]
value = splitlist[1]
if "$" in format_str:
    pass
elif "," in format_str:
    pass
elif "*$" in format_str:
    pass
elif "-" in format_str:
    pass
else:
    pass