/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public enum ej
/*   6:    */   implements va
/*   7:    */ {
/*   8:    */   private final int g;
/*   9:    */   private final int h;
/*  10:    */   private final int i;
/*  11:    */   private final String j;
/*  12:    */   private final el k;
/*  13:    */   private final em l;
/*  14:    */   private final fd m;
/*  15:    */   private static final ej[] n;
/*  16:    */   private static final ej[] o;
/*  17:    */   private static final Map p;
/*  18:    */   
/*  19:    */   static
/*  20:    */   {
/*  21: 31 */     n = new ej[6];
/*  22: 32 */     o = new ej[4];
/*  23: 33 */     p = Maps.newHashMap();
/*  24: 36 */     for (ej localej : values())
/*  25:    */     {
/*  26: 37 */       n[localej.g] = localej;
/*  27: 39 */       if (localej.k().c()) {
/*  28: 40 */         o[localej.i] = localej;
/*  29:    */       }
/*  30: 43 */       p.put(localej.j().toLowerCase(), localej);
/*  31:    */     }
/*  32:    */   }
/*  33:    */   
/*  34:    */   private ej(int paramInt1, int paramInt2, int paramInt3, String paramString, em paramem, el paramel, fd paramfd)
/*  35:    */   {
/*  36: 48 */     this.g = paramInt1;
/*  37: 49 */     this.i = paramInt3;
/*  38: 50 */     this.h = paramInt2;
/*  39: 51 */     this.j = paramString;
/*  40: 52 */     this.k = paramel;
/*  41: 53 */     this.l = paramem;
/*  42: 54 */     this.m = paramfd;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public int a()
/*  46:    */   {
/*  47: 58 */     return this.g;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public int b()
/*  51:    */   {
/*  52: 62 */     return this.i;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public em c()
/*  56:    */   {
/*  57: 66 */     return this.l;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public ej d()
/*  61:    */   {
/*  62: 70 */     return a(this.h);
/*  63:    */   }
/*  64:    */   
/*  65:    */   public ej a(el paramel)
/*  66:    */   {
/*  67: 74 */     switch (ek.a[paramel.ordinal()])
/*  68:    */     {
/*  69:    */     case 1: 
/*  70: 76 */       if ((this == e) || (this == f)) {
/*  71: 77 */         return this;
/*  72:    */       }
/*  73: 79 */       return n();
/*  74:    */     case 2: 
/*  75: 82 */       if ((this == b) || (this == a)) {
/*  76: 83 */         return this;
/*  77:    */       }
/*  78: 85 */       return e();
/*  79:    */     case 3: 
/*  80: 88 */       if ((this == c) || (this == d)) {
/*  81: 89 */         return this;
/*  82:    */       }
/*  83: 91 */       return p();
/*  84:    */     }
/*  85: 94 */     throw new IllegalStateException("Unable to get CW facing for axis " + paramel);
/*  86:    */   }
/*  87:    */   
/*  88:    */   public ej e()
/*  89:    */   {
/*  90:124 */     switch (ek.b[ordinal()])
/*  91:    */     {
/*  92:    */     case 1: 
/*  93:126 */       return f;
/*  94:    */     case 2: 
/*  95:128 */       return d;
/*  96:    */     case 3: 
/*  97:130 */       return e;
/*  98:    */     case 4: 
/*  99:132 */       return c;
/* 100:    */     }
/* 101:134 */     throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
/* 102:    */   }
/* 103:    */   
/* 104:    */   private ej n()
/* 105:    */   {
/* 106:139 */     switch (ek.b[ordinal()])
/* 107:    */     {
/* 108:    */     case 5: 
/* 109:141 */       return c;
/* 110:    */     case 1: 
/* 111:143 */       return a;
/* 112:    */     case 6: 
/* 113:145 */       return d;
/* 114:    */     case 3: 
/* 115:147 */       return b;
/* 116:    */     }
/* 117:149 */     throw new IllegalStateException("Unable to get X-rotated facing of " + this);
/* 118:    */   }
/* 119:    */   
/* 120:    */   private ej p()
/* 121:    */   {
/* 122:169 */     switch (ek.b[ordinal()])
/* 123:    */     {
/* 124:    */     case 5: 
/* 125:171 */       return f;
/* 126:    */     case 2: 
/* 127:173 */       return a;
/* 128:    */     case 6: 
/* 129:175 */       return e;
/* 130:    */     case 4: 
/* 131:177 */       return b;
/* 132:    */     }
/* 133:179 */     throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
/* 134:    */   }
/* 135:    */   
/* 136:    */   public ej f()
/* 137:    */   {
/* 138:199 */     switch (ek.b[ordinal()])
/* 139:    */     {
/* 140:    */     case 1: 
/* 141:201 */       return e;
/* 142:    */     case 2: 
/* 143:203 */       return c;
/* 144:    */     case 3: 
/* 145:205 */       return f;
/* 146:    */     case 4: 
/* 147:207 */       return d;
/* 148:    */     }
/* 149:209 */     throw new IllegalStateException("Unable to get CCW facing of " + this);
/* 150:    */   }
/* 151:    */   
/* 152:    */   public int g()
/* 153:    */   {
/* 154:214 */     if (this.k == el.a) {
/* 155:215 */       return this.l.a();
/* 156:    */     }
/* 157:217 */     return 0;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public int h()
/* 161:    */   {
/* 162:222 */     if (this.k == el.b) {
/* 163:223 */       return this.l.a();
/* 164:    */     }
/* 165:225 */     return 0;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public int i()
/* 169:    */   {
/* 170:230 */     if (this.k == el.c) {
/* 171:231 */       return this.l.a();
/* 172:    */     }
/* 173:233 */     return 0;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public String j()
/* 177:    */   {
/* 178:238 */     return this.j;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public el k()
/* 182:    */   {
/* 183:242 */     return this.k;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public static ej a(String paramString)
/* 187:    */   {
/* 188:247 */     if (paramString == null) {
/* 189:248 */       return null;
/* 190:    */     }
/* 191:250 */     return (ej)p.get(paramString.toLowerCase());
/* 192:    */   }
/* 193:    */   
/* 194:    */   public static ej a(int paramInt)
/* 195:    */   {
/* 196:254 */     return n[uv.a(paramInt % n.length)];
/* 197:    */   }
/* 198:    */   
/* 199:    */   public static ej b(int paramInt)
/* 200:    */   {
/* 201:258 */     return o[uv.a(paramInt % o.length)];
/* 202:    */   }
/* 203:    */   
/* 204:    */   public static ej a(double paramDouble)
/* 205:    */   {
/* 206:262 */     return b(uv.c(paramDouble / 90.0D + 0.5D) & 0x3);
/* 207:    */   }
/* 208:    */   
/* 209:    */   public static ej a(Random paramRandom)
/* 210:    */   {
/* 211:266 */     return values()[paramRandom.nextInt(values().length)];
/* 212:    */   }
/* 213:    */   
/* 214:    */   public static ej a(float paramFloat1, float paramFloat2, float paramFloat3)
/* 215:    */   {
/* 216:283 */     Object localObject = c;
/* 217:284 */     float f1 = 1.4E-45F;
/* 218:285 */     for (ej localej : values())
/* 219:    */     {
/* 220:286 */       float f2 = paramFloat1 * localej.m.n() + paramFloat2 * localej.m.o() + paramFloat3 * localej.m.p();
/* 221:288 */       if (f2 > f1)
/* 222:    */       {
/* 223:289 */         f1 = f2;
/* 224:290 */         localObject = localej;
/* 225:    */       }
/* 226:    */     }
/* 227:293 */     return localObject;
/* 228:    */   }
/* 229:    */   
/* 230:    */   public String toString()
/* 231:    */   {
/* 232:298 */     return this.j;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public String l()
/* 236:    */   {
/* 237:303 */     return this.j;
/* 238:    */   }
/* 239:    */   
/* 240:    */   public fd m()
/* 241:    */   {
/* 242:396 */     return this.m;
/* 243:    */   }
/* 244:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ej
 * JD-Core Version:    0.7.0.1
 */