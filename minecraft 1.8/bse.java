/*   1:    */ import java.util.Collection;
/*   2:    */ import java.util.Map;
/*   3:    */ import org.apache.logging.log4j.LogManager;
/*   4:    */ import org.apache.logging.log4j.Logger;
/*   5:    */ 
/*   6:    */ public class bse
/*   7:    */   extends bqc
/*   8:    */ {
/*   9: 16 */   private static final Logger b = ;
/*  10:    */   private bsd c;
/*  11:    */   private fn d;
/*  12:    */   
/*  13:    */   public bse()
/*  14:    */   {
/*  15: 23 */     this("scoreboard");
/*  16:    */   }
/*  17:    */   
/*  18:    */   public bse(String paramString)
/*  19:    */   {
/*  20: 27 */     super(paramString);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void a(bsd parambsd)
/*  24:    */   {
/*  25: 31 */     this.c = parambsd;
/*  26: 33 */     if (this.d != null) {
/*  27: 34 */       a(this.d);
/*  28:    */     }
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void a(fn paramfn)
/*  32:    */   {
/*  33: 40 */     if (this.c == null)
/*  34:    */     {
/*  35: 41 */       this.d = paramfn;
/*  36: 42 */       return;
/*  37:    */     }
/*  38: 45 */     b(paramfn.c("Objectives", 10));
/*  39: 46 */     c(paramfn.c("PlayerScores", 10));
/*  40: 48 */     if (paramfn.b("DisplaySlots", 10)) {
/*  41: 49 */       c(paramfn.m("DisplaySlots"));
/*  42:    */     }
/*  43: 52 */     if (paramfn.b("Teams", 9)) {
/*  44: 53 */       a(paramfn.c("Teams", 10));
/*  45:    */     }
/*  46:    */   }
/*  47:    */   
/*  48:    */   protected void a(fv paramfv)
/*  49:    */   {
/*  50: 58 */     for (int i = 0; i < paramfv.c(); i++)
/*  51:    */     {
/*  52: 59 */       fn localfn = paramfv.b(i);
/*  53:    */       
/*  54: 61 */       brz localbrz = this.c.e(localfn.j("Name"));
/*  55: 62 */       localbrz.a(localfn.j("DisplayName"));
/*  56: 63 */       if (localfn.b("TeamColor", 8)) {
/*  57: 64 */         localbrz.a(a.b(localfn.j("TeamColor")));
/*  58:    */       }
/*  59: 66 */       localbrz.b(localfn.j("Prefix"));
/*  60: 67 */       localbrz.c(localfn.j("Suffix"));
/*  61: 68 */       if (localfn.b("AllowFriendlyFire", 99)) {
/*  62: 69 */         localbrz.a(localfn.n("AllowFriendlyFire"));
/*  63:    */       }
/*  64: 71 */       if (localfn.b("SeeFriendlyInvisibles", 99)) {
/*  65: 72 */         localbrz.b(localfn.n("SeeFriendlyInvisibles"));
/*  66:    */       }
/*  67:    */       bsg localbsg;
/*  68: 74 */       if (localfn.b("NameTagVisibility", 8))
/*  69:    */       {
/*  70: 75 */         localbsg = bsg.a(localfn.j("NameTagVisibility"));
/*  71: 76 */         if (localbsg != null) {
/*  72: 77 */           localbrz.a(localbsg);
/*  73:    */         }
/*  74:    */       }
/*  75: 80 */       if (localfn.b("DeathMessageVisibility", 8))
/*  76:    */       {
/*  77: 81 */         localbsg = bsg.a(localfn.j("DeathMessageVisibility"));
/*  78: 82 */         if (localbsg != null) {
/*  79: 83 */           localbrz.b(localbsg);
/*  80:    */         }
/*  81:    */       }
/*  82: 87 */       a(localbrz, localfn.c("Players", 8));
/*  83:    */     }
/*  84:    */   }
/*  85:    */   
/*  86:    */   protected void a(brz parambrz, fv paramfv)
/*  87:    */   {
/*  88: 92 */     for (int i = 0; i < paramfv.c(); i++) {
/*  89: 93 */       this.c.a(paramfv.f(i), parambrz.b());
/*  90:    */     }
/*  91:    */   }
/*  92:    */   
/*  93:    */   protected void c(fn paramfn)
/*  94:    */   {
/*  95: 98 */     for (int i = 0; i < 19; i++) {
/*  96: 99 */       if (paramfn.b("slot_" + i, 8))
/*  97:    */       {
/*  98:100 */         String str = paramfn.j("slot_" + i);
/*  99:101 */         bry localbry = this.c.b(str);
/* 100:102 */         this.c.a(i, localbry);
/* 101:    */       }
/* 102:    */     }
/* 103:    */   }
/* 104:    */   
/* 105:    */   protected void b(fv paramfv)
/* 106:    */   {
/* 107:108 */     for (int i = 0; i < paramfv.c(); i++)
/* 108:    */     {
/* 109:109 */       fn localfn = paramfv.b(i);
/* 110:    */       
/* 111:111 */       bsk localbsk = (bsk)bsk.a.get(localfn.j("CriteriaName"));
/* 112:112 */       if (localbsk != null)
/* 113:    */       {
/* 114:115 */         bry localbry = this.c.a(localfn.j("Name"), localbsk);
/* 115:116 */         localbry.a(localfn.j("DisplayName"));
/* 116:117 */         localbry.a(bsl.a(localfn.j("RenderType")));
/* 117:    */       }
/* 118:    */     }
/* 119:    */   }
/* 120:    */   
/* 121:    */   protected void c(fv paramfv)
/* 122:    */   {
/* 123:122 */     for (int i = 0; i < paramfv.c(); i++)
/* 124:    */     {
/* 125:123 */       fn localfn = paramfv.b(i);
/* 126:    */       
/* 127:125 */       bry localbry = this.c.b(localfn.j("Objective"));
/* 128:126 */       bsa localbsa = this.c.c(localfn.j("Name"), localbry);
/* 129:127 */       localbsa.c(localfn.f("Score"));
/* 130:128 */       if (localfn.c("Locked")) {
/* 131:129 */         localbsa.a(localfn.n("Locked"));
/* 132:    */       }
/* 133:    */     }
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void b(fn paramfn)
/* 137:    */   {
/* 138:136 */     if (this.c == null)
/* 139:    */     {
/* 140:137 */       b.warn("Tried to save scoreboard without having a scoreboard...");
/* 141:138 */       return;
/* 142:    */     }
/* 143:141 */     paramfn.a("Objectives", b());
/* 144:142 */     paramfn.a("PlayerScores", e());
/* 145:143 */     paramfn.a("Teams", a());
/* 146:    */     
/* 147:145 */     d(paramfn);
/* 148:    */   }
/* 149:    */   
/* 150:    */   protected fv a()
/* 151:    */   {
/* 152:149 */     fv localfv1 = new fv();
/* 153:150 */     Collection localCollection = this.c.g();
/* 154:152 */     for (brz localbrz : localCollection)
/* 155:    */     {
/* 156:153 */       fn localfn = new fn();
/* 157:    */       
/* 158:155 */       localfn.a("Name", localbrz.b());
/* 159:156 */       localfn.a("DisplayName", localbrz.c());
/* 160:157 */       if (localbrz.l().b() >= 0) {
/* 161:158 */         localfn.a("TeamColor", localbrz.l().e());
/* 162:    */       }
/* 163:160 */       localfn.a("Prefix", localbrz.e());
/* 164:161 */       localfn.a("Suffix", localbrz.f());
/* 165:162 */       localfn.a("AllowFriendlyFire", localbrz.g());
/* 166:163 */       localfn.a("SeeFriendlyInvisibles", localbrz.h());
/* 167:164 */       localfn.a("NameTagVisibility", localbrz.i().e);
/* 168:165 */       localfn.a("DeathMessageVisibility", localbrz.j().e);
/* 169:    */       
/* 170:167 */       fv localfv2 = new fv();
/* 171:169 */       for (String str : localbrz.d()) {
/* 172:170 */         localfv2.a(new gc(str));
/* 173:    */       }
/* 174:173 */       localfn.a("Players", localfv2);
/* 175:    */       
/* 176:175 */       localfv1.a(localfn);
/* 177:    */     }
/* 178:178 */     return localfv1;
/* 179:    */   }
/* 180:    */   
/* 181:    */   protected void d(fn paramfn)
/* 182:    */   {
/* 183:182 */     fn localfn = new fn();
/* 184:183 */     int i = 0;
/* 185:185 */     for (int j = 0; j < 19; j++)
/* 186:    */     {
/* 187:186 */       bry localbry = this.c.a(j);
/* 188:188 */       if (localbry != null)
/* 189:    */       {
/* 190:189 */         localfn.a("slot_" + j, localbry.b());
/* 191:190 */         i = 1;
/* 192:    */       }
/* 193:    */     }
/* 194:194 */     if (i != 0) {
/* 195:195 */       paramfn.a("DisplaySlots", localfn);
/* 196:    */     }
/* 197:    */   }
/* 198:    */   
/* 199:    */   protected fv b()
/* 200:    */   {
/* 201:200 */     fv localfv = new fv();
/* 202:201 */     Collection localCollection = this.c.c();
/* 203:203 */     for (bry localbry : localCollection) {
/* 204:204 */       if (localbry.c() != null)
/* 205:    */       {
/* 206:208 */         fn localfn = new fn();
/* 207:209 */         localfn.a("Name", localbry.b());
/* 208:210 */         localfn.a("CriteriaName", localbry.c().a());
/* 209:211 */         localfn.a("DisplayName", localbry.d());
/* 210:212 */         localfn.a("RenderType", localbry.e().a());
/* 211:    */         
/* 212:214 */         localfv.a(localfn);
/* 213:    */       }
/* 214:    */     }
/* 215:217 */     return localfv;
/* 216:    */   }
/* 217:    */   
/* 218:    */   protected fv e()
/* 219:    */   {
/* 220:221 */     fv localfv = new fv();
/* 221:222 */     Collection localCollection = this.c.e();
/* 222:224 */     for (bsa localbsa : localCollection) {
/* 223:225 */       if (localbsa.d() != null)
/* 224:    */       {
/* 225:229 */         fn localfn = new fn();
/* 226:230 */         localfn.a("Name", localbsa.e());
/* 227:231 */         localfn.a("Objective", localbsa.d().b());
/* 228:232 */         localfn.a("Score", localbsa.c());
/* 229:233 */         localfn.a("Locked", localbsa.g());
/* 230:    */         
/* 231:235 */         localfv.a(localfn);
/* 232:    */       }
/* 233:    */     }
/* 234:238 */     return localfv;
/* 235:    */   }
/* 236:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bse
 * JD-Core Version:    0.7.0.1
 */