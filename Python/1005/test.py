human = ["松田","浅木","工藤"]
test = ["network","database","security"]
pointM = [90,70,50]
pointA = [70,60,100]
pointK = [60,95,75]
test_PointM = dict(zip(test,pointM))
test_PointA = dict(zip(test,pointA))
test_PointK = dict(zip(test,pointK))
human_Point = {human[0]:test_PointM,human[1]:test_PointA,human[2]:test_PointK}
import pprint
pprint.pprint(human_Point)