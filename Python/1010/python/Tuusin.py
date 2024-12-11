import requests as req
url = "http://api.oprn-notify.org/iss-now.json"
res=req.get(url)
print(res.text)
