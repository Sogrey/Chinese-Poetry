# DB设置原型：

古诗词：
``` json
    {
        "author": "作者",
        "paragraphs": [
            "诗句，按照断句分割维数组。"
        ],
		notes:["注释"],
		annotations:["译文"],
        "title": "诗词标题",
        "id": "诗词唯一UUID",
		"tags": ["标签"],
		"years": "年代，如：唐代、宋代",
		"style": "风格|派别，例如：豪放、婉约",
		"types": ["类型"],
		"poetryCollection":[{
			"title":'被收录的诗集',
			"id":'诗集唯一UUID',
		}]
    },
```

作者信息：
``` json
    {
        "author": "作者名",
        "lifetime": ['生平，可按照分段分割为数组'],
        "代表作": [{
			"title": "诗词标题",
            "id": "诗词唯一UUID",
		}],
        "id": "作者唯一UUID",
		"years": "年代"
    },
```
派别信息：
``` json
    {
        "sect": "派别名",
        "introduction ": ['简介，可按照分段分割为数组'],
        "代表人物": [{
			"author": "代表人物名字",
            "id": "作者唯一UUID",
			"works":[{			
				"title": "代表诗词标题",
				"id": "诗词唯一UUID",
			}]
		}],
        "id": "派别唯一UUID",
		"years": "所属年代"
    },
```
佳句：
``` json
    {
        "author": "作者",
        "paragraphs": [
            "假句，按照断句分割维数组。"
        ],
        "title": "诗词标题",
        "id": "诗词唯一UUID"
    },
```
诗集&分类
``` json
    {
        "sect": "诗集名",
        "introduction ": ['简介，可按照分段分割为数组'],
        "代表人物": [{
			"title": "代表作",
            "id": "诗词唯一UUID",
		}],
        "id": "诗集唯一UUID",
    },
```
提交完善


	
形式：诗、词、曲、文言文
朝代：先秦、两汉、魏晋、南北朝、隋代、唐代、五代、宋代、金朝、元代、明代、清代
类型：唐诗三百、古诗三百、宋词三百、小学古诗、初中古诗、高中古诗、小学文言、初中文言、高中文言、宋词、诗经、楚辞、乐府、写景、咏物、春天、夏天、秋天、冬天、写雨、写雪、写风、写花、梅花、荷花、菊花、柳树、月亮、山水、写山、写水、长江、黄河、儿童、写鸟、写马、田园、边塞、地名、节日、春节、元宵、寒食、清明、端午、七夕、中秋、重阳、怀古、抒情、爱国、离别、送别、思乡、思念、爱情、励志、哲理、闺怨、悼亡、写人、老师、母亲、友情、战争、读书、惜时、忧民、婉约、豪放、民谣、古文观止


https://so.gushiwen.cn/shiwen/default_3A6A1.aspx
http://qts.zww.cn/#
https://www.zww.cn/baike/o/4/4673.htm
http://www.guoxue123.com/index.htm
http://www3.zzu.edu.cn/qts/
