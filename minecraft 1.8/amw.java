/*   1:    */ import com.google.common.collect.HashMultimap;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import com.google.common.collect.Maps;
/*   4:    */ import com.google.common.collect.Multimap;
/*   5:    */ import java.text.DecimalFormat;
/*   6:    */ import java.util.Collection;
/*   7:    */ import java.util.Iterator;
/*   8:    */ import java.util.List;
/*   9:    */ import java.util.Map;
/*  10:    */ import java.util.Map.Entry;
/*  11:    */ import java.util.Random;
/*  12:    */ 
/*  13:    */ public class amw
/*  14:    */   extends alq
/*  15:    */ {
/*  16: 33 */   private Map a = Maps.newHashMap();
/*  17: 34 */   private static final Map b = ;
/*  18:    */   
/*  19:    */   public amw()
/*  20:    */   {
/*  21: 37 */     c(1);
/*  22: 38 */     a(true);
/*  23: 39 */     d(0);
/*  24: 40 */     a(akf.k);
/*  25:    */   }
/*  26:    */   
/*  27:    */   public List h(amj paramamj)
/*  28:    */   {
/*  29: 44 */     if ((!paramamj.n()) || (!paramamj.o().b("CustomPotionEffects", 9)))
/*  30:    */     {
/*  31: 45 */       localObject = (List)this.a.get(Integer.valueOf(paramamj.i()));
/*  32: 47 */       if (localObject == null)
/*  33:    */       {
/*  34: 48 */         localObject = ans.b(paramamj.i(), false);
/*  35: 49 */         this.a.put(Integer.valueOf(paramamj.i()), localObject);
/*  36:    */       }
/*  37: 52 */       return localObject;
/*  38:    */     }
/*  39: 54 */     Object localObject = Lists.newArrayList();
/*  40: 55 */     fv localfv = paramamj.o().c("CustomPotionEffects", 10);
/*  41: 57 */     for (int i = 0; i < localfv.c(); i++)
/*  42:    */     {
/*  43: 58 */       fn localfn = localfv.b(i);
/*  44: 59 */       wq localwq = wq.b(localfn);
/*  45: 60 */       if (localwq != null) {
/*  46: 61 */         ((List)localObject).add(localwq);
/*  47:    */       }
/*  48:    */     }
/*  49: 65 */     return localObject;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public List e(int paramInt)
/*  53:    */   {
/*  54: 70 */     List localList = (List)this.a.get(Integer.valueOf(paramInt));
/*  55: 71 */     if (localList == null)
/*  56:    */     {
/*  57: 72 */       localList = ans.b(paramInt, false);
/*  58: 73 */       this.a.put(Integer.valueOf(paramInt), localList);
/*  59:    */     }
/*  60: 75 */     return localList;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public amj b(amj paramamj, aqu paramaqu, ahd paramahd)
/*  64:    */   {
/*  65: 80 */     if (!paramahd.by.d) {
/*  66: 81 */       paramamj.b -= 1;
/*  67:    */     }
/*  68: 84 */     if (!paramaqu.D)
/*  69:    */     {
/*  70: 85 */       List localList = h(paramamj);
/*  71: 86 */       if (localList != null) {
/*  72: 87 */         for (wq localwq : localList) {
/*  73: 88 */           paramahd.c(new wq(localwq));
/*  74:    */         }
/*  75:    */       }
/*  76:    */     }
/*  77: 92 */     paramahd.b(ty.J[alq.b(this)]);
/*  78: 93 */     if (!paramahd.by.d)
/*  79:    */     {
/*  80: 94 */       if (paramamj.b <= 0) {
/*  81: 95 */         return new amj(amk.bA);
/*  82:    */       }
/*  83: 97 */       paramahd.bg.a(new amj(amk.bA));
/*  84:    */     }
/*  85:101 */     return paramamj;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public int d(amj paramamj)
/*  89:    */   {
/*  90:106 */     return 32;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public ano e(amj paramamj)
/*  94:    */   {
/*  95:111 */     return ano.c;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/*  99:    */   {
/* 100:116 */     if (f(paramamj.i()))
/* 101:    */     {
/* 102:117 */       if (!paramahd.by.d) {
/* 103:118 */         paramamj.b -= 1;
/* 104:    */       }
/* 105:120 */       paramaqu.a(paramahd, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
/* 106:121 */       if (!paramaqu.D) {
/* 107:122 */         paramaqu.d(new ahv(paramaqu, paramahd, paramamj));
/* 108:    */       }
/* 109:124 */       paramahd.b(ty.J[alq.b(this)]);
/* 110:125 */       return paramamj;
/* 111:    */     }
/* 112:127 */     paramahd.a(paramamj, d(paramamj));
/* 113:128 */     return paramamj;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public static boolean f(int paramInt)
/* 117:    */   {
/* 118:132 */     return (paramInt & 0x4000) != 0;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public int g(int paramInt)
/* 122:    */   {
/* 123:136 */     return ans.a(paramInt, false);
/* 124:    */   }
/* 125:    */   
/* 126:    */   public int a(amj paramamj, int paramInt)
/* 127:    */   {
/* 128:141 */     if (paramInt > 0) {
/* 129:142 */       return 16777215;
/* 130:    */     }
/* 131:144 */     return g(paramamj.i());
/* 132:    */   }
/* 133:    */   
/* 134:    */   public boolean h(int paramInt)
/* 135:    */   {
/* 136:148 */     List localList = e(paramInt);
/* 137:149 */     if ((localList == null) || (localList.isEmpty())) {
/* 138:150 */       return false;
/* 139:    */     }
/* 140:152 */     for (wq localwq : localList) {
/* 141:153 */       if (wp.a[localwq.a()].b()) {
/* 142:154 */         return true;
/* 143:    */       }
/* 144:    */     }
/* 145:157 */     return false;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String a(amj paramamj)
/* 149:    */   {
/* 150:162 */     if (paramamj.i() == 0) {
/* 151:163 */       return fi.a("item.emptyPotion.name").trim();
/* 152:    */     }
/* 153:166 */     String str1 = "";
/* 154:167 */     if (f(paramamj.i())) {
/* 155:168 */       str1 = fi.a("potion.prefix.grenade").trim() + " ";
/* 156:    */     }
/* 157:171 */     List localList = amk.bz.h(paramamj);
/* 158:172 */     if ((localList != null) && (!localList.isEmpty()))
/* 159:    */     {
/* 160:173 */       str2 = ((wq)localList.get(0)).g();
/* 161:174 */       str2 = str2 + ".postfix";
/* 162:175 */       return str1 + fi.a(str2).trim();
/* 163:    */     }
/* 164:177 */     String str2 = ans.c(paramamj.i());
/* 165:178 */     return fi.a(str2).trim() + " " + super.a(paramamj);
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void a(amj paramamj, ahd paramahd, List paramList, boolean paramBoolean)
/* 169:    */   {
/* 170:184 */     if (paramamj.i() == 0) {
/* 171:185 */       return;
/* 172:    */     }
/* 173:188 */     List localList = amk.bz.h(paramamj);
/* 174:189 */     HashMultimap localHashMultimap = HashMultimap.create();
/* 175:    */     Object localObject1;
/* 176:    */     Object localObject2;
/* 177:    */     Object localObject3;
/* 178:191 */     if ((localList != null) && (!localList.isEmpty()))
/* 179:    */     {
/* 180:192 */       for (localObject1 = localList.iterator(); ((Iterator)localObject1).hasNext();)
/* 181:    */       {
/* 182:192 */         localObject2 = (wq)((Iterator)localObject1).next();
/* 183:193 */         localObject3 = fi.a(((wq)localObject2).g()).trim();
/* 184:194 */         wp localwp = wp.a[localObject2.a()];
/* 185:195 */         Map localMap = localwp.l();
/* 186:197 */         if ((localMap != null) && (localMap.size() > 0)) {
/* 187:198 */           for (Map.Entry localEntry : localMap.entrySet())
/* 188:    */           {
/* 189:199 */             ya localya1 = (ya)localEntry.getValue();
/* 190:200 */             ya localya2 = new ya(localya1.b(), localwp.a(((wq)localObject2).c(), localya1), localya1.c());
/* 191:201 */             localHashMultimap.put(((xy)localEntry.getKey()).a(), localya2);
/* 192:    */           }
/* 193:    */         }
/* 194:205 */         if (((wq)localObject2).c() > 0) {
/* 195:206 */           localObject3 = (String)localObject3 + " " + fi.a(new StringBuilder().append("potion.potency.").append(((wq)localObject2).c()).toString()).trim();
/* 196:    */         }
/* 197:209 */         if (((wq)localObject2).b() > 20) {
/* 198:210 */           localObject3 = (String)localObject3 + " (" + wp.a((wq)localObject2) + ")";
/* 199:    */         }
/* 200:213 */         if (localwp.g()) {
/* 201:214 */           paramList.add(a.m + (String)localObject3);
/* 202:    */         } else {
/* 203:216 */           paramList.add(a.h + (String)localObject3);
/* 204:    */         }
/* 205:    */       }
/* 206:    */     }
/* 207:    */     else
/* 208:    */     {
/* 209:220 */       localObject1 = fi.a("potion.empty").trim();
/* 210:221 */       paramList.add(a.h + (String)localObject1);
/* 211:    */     }
/* 212:224 */     if (!localHashMultimap.isEmpty())
/* 213:    */     {
/* 214:225 */       paramList.add("");
/* 215:226 */       paramList.add(a.f + fi.a("potion.effects.whenDrank"));
/* 216:228 */       for (localObject1 = localHashMultimap.entries().iterator(); ((Iterator)localObject1).hasNext();)
/* 217:    */       {
/* 218:228 */         localObject2 = (Map.Entry)((Iterator)localObject1).next();
/* 219:229 */         localObject3 = (ya)((Map.Entry)localObject2).getValue();
/* 220:230 */         double d1 = ((ya)localObject3).d();
/* 221:    */         double d2;
/* 222:233 */         if ((((ya)localObject3).c() == 1) || (((ya)localObject3).c() == 2)) {
/* 223:234 */           d2 = ((ya)localObject3).d() * 100.0D;
/* 224:    */         } else {
/* 225:236 */           d2 = ((ya)localObject3).d();
/* 226:    */         }
/* 227:239 */         if (d1 > 0.0D)
/* 228:    */         {
/* 229:240 */           paramList.add(a.j + fi.a(new StringBuilder().append("attribute.modifier.plus.").append(((ya)localObject3).c()).toString(), new Object[] { amj.a.format(d2), fi.a("attribute.name." + (String)((Map.Entry)localObject2).getKey()) }));
/* 230:    */         }
/* 231:241 */         else if (d1 < 0.0D)
/* 232:    */         {
/* 233:242 */           d2 *= -1.0D;
/* 234:243 */           paramList.add(a.m + fi.a(new StringBuilder().append("attribute.modifier.take.").append(((ya)localObject3).c()).toString(), new Object[] { amj.a.format(d2), fi.a("attribute.name." + (String)((Map.Entry)localObject2).getKey()) }));
/* 235:    */         }
/* 236:    */       }
/* 237:    */     }
/* 238:    */   }
/* 239:    */   
/* 240:    */   public boolean f(amj paramamj)
/* 241:    */   {
/* 242:251 */     List localList = h(paramamj);
/* 243:252 */     return (localList != null) && (!localList.isEmpty());
/* 244:    */   }
/* 245:    */   
/* 246:    */   public void a(alq paramalq, akf paramakf, List paramList)
/* 247:    */   {
/* 248:257 */     super.a(paramalq, paramakf, paramList);
/* 249:    */     int j;
/* 250:259 */     if (b.isEmpty()) {
/* 251:260 */       for (int i = 0; i <= 15; i++) {
/* 252:261 */         for (j = 0; j <= 1; j++)
/* 253:    */         {
/* 254:262 */           int k = i;
/* 255:263 */           if (j == 0) {
/* 256:264 */             k |= 0x2000;
/* 257:    */           } else {
/* 258:266 */             k |= 0x4000;
/* 259:    */           }
/* 260:268 */           for (int m = 0; m <= 2; m++)
/* 261:    */           {
/* 262:269 */             int n = k;
/* 263:270 */             if (m != 0) {
/* 264:272 */               if (m == 1) {
/* 265:273 */                 n |= 0x20;
/* 266:274 */               } else if (m == 2) {
/* 267:275 */                 n |= 0x40;
/* 268:    */               }
/* 269:    */             }
/* 270:278 */             List localList = ans.b(n, false);
/* 271:280 */             if ((localList != null) && (!localList.isEmpty())) {
/* 272:281 */               b.put(localList, Integer.valueOf(n));
/* 273:    */             }
/* 274:    */           }
/* 275:    */         }
/* 276:    */       }
/* 277:    */     }
/* 278:288 */     for (Iterator localIterator = b.values().iterator(); localIterator.hasNext();)
/* 279:    */     {
/* 280:288 */       j = ((Integer)localIterator.next()).intValue();
/* 281:289 */       paramList.add(new amj(paramalq, 1, j));
/* 282:    */     }
/* 283:    */   }
/* 284:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     amw
 * JD-Core Version:    0.7.0.1
 */