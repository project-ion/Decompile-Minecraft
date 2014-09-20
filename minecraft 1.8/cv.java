/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class cv
/*   4:    */   extends z
/*   5:    */ {
/*   6:    */   public String c()
/*   7:    */   {
/*   8: 26 */     return "summon";
/*   9:    */   }
/*  10:    */   
/*  11:    */   public int a()
/*  12:    */   {
/*  13: 31 */     return 2;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public String c(ae paramae)
/*  17:    */   {
/*  18: 36 */     return "commands.summon.usage";
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(ae paramae, String[] paramArrayOfString)
/*  22:    */   {
/*  23: 41 */     if (paramArrayOfString.length < 1) {
/*  24: 42 */       throw new dp("commands.summon.usage", new Object[0]);
/*  25:    */     }
/*  26: 45 */     String str = paramArrayOfString[0];
/*  27: 46 */     dt localdt = paramae.c();
/*  28: 47 */     brw localbrw = paramae.d();
/*  29:    */     
/*  30: 49 */     double d1 = localbrw.a;
/*  31: 50 */     double d2 = localbrw.b;
/*  32: 51 */     double d3 = localbrw.c;
/*  33: 53 */     if (paramArrayOfString.length >= 4)
/*  34:    */     {
/*  35: 54 */       d1 = b(d1, paramArrayOfString[1], true);
/*  36: 55 */       d2 = b(d2, paramArrayOfString[2], false);
/*  37: 56 */       d3 = b(d3, paramArrayOfString[3], true);
/*  38: 57 */       localdt = new dt(d1, d2, d3);
/*  39:    */     }
/*  40: 60 */     aqu localaqu = paramae.e();
/*  41: 61 */     if (!localaqu.e(localdt)) {
/*  42: 62 */       throw new di("commands.summon.outOfWorld", new Object[0]);
/*  43:    */     }
/*  44: 66 */     if ("LightningBolt".equals(str))
/*  45:    */     {
/*  46: 67 */       localaqu.c(new ads(localaqu, d1, d2, d3));
/*  47: 68 */       a(paramae, this, "commands.summon.success", new Object[0]);
/*  48: 69 */       return;
/*  49:    */     }
/*  50: 72 */     fn localfn1 = new fn();
/*  51: 73 */     int i = 0;
/*  52:    */     Object localObject1;
/*  53: 74 */     if (paramArrayOfString.length >= 5)
/*  54:    */     {
/*  55: 75 */       localObject1 = a(paramae, paramArrayOfString, 4);
/*  56:    */       try
/*  57:    */       {
/*  58: 77 */         localfn1 = gg.a(((ho)localObject1).c());
/*  59: 78 */         i = 1;
/*  60:    */       }
/*  61:    */       catch (gf localgf)
/*  62:    */       {
/*  63: 80 */         throw new di("commands.summon.tagError", new Object[] { localgf.getMessage() });
/*  64:    */       }
/*  65:    */     }
/*  66: 83 */     localfn1.a("id", str);
/*  67:    */     try
/*  68:    */     {
/*  69: 87 */       localObject1 = xb.a(localfn1, localaqu);
/*  70:    */     }
/*  71:    */     catch (RuntimeException localRuntimeException)
/*  72:    */     {
/*  73: 89 */       throw new di("commands.summon.failed", new Object[0]);
/*  74:    */     }
/*  75: 92 */     if (localObject1 == null) {
/*  76: 93 */       throw new di("commands.summon.failed", new Object[0]);
/*  77:    */     }
/*  78: 96 */     ((wv)localObject1).b(d1, d2, d3, ((wv)localObject1).y, ((wv)localObject1).z);
/*  79: 97 */     if (i == 0) {
/*  80: 99 */       if ((localObject1 instanceof xn)) {
/*  81:100 */         ((xn)localObject1).a(localaqu.E(new dt((wv)localObject1)), null);
/*  82:    */       }
/*  83:    */     }
/*  84:103 */     localaqu.d((wv)localObject1);
/*  85:    */     
/*  86:    */ 
/*  87:106 */     Object localObject2 = localObject1;
/*  88:107 */     fn localfn2 = localfn1;
/*  89:108 */     while ((localObject2 != null) && (localfn2.b("Riding", 10)))
/*  90:    */     {
/*  91:109 */       wv localwv = xb.a(localfn2.m("Riding"), localaqu);
/*  92:110 */       if (localwv != null)
/*  93:    */       {
/*  94:111 */         localwv.b(d1, d2, d3, localwv.y, localwv.z);
/*  95:112 */         localaqu.d(localwv);
/*  96:113 */         localObject2.a(localwv);
/*  97:    */       }
/*  98:115 */       localObject2 = localwv;
/*  99:116 */       localfn2 = localfn2.m("Riding");
/* 100:    */     }
/* 101:118 */     a(paramae, this, "commands.summon.success", new Object[0]);
/* 102:    */   }
/* 103:    */   
/* 104:    */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 105:    */   {
/* 106:124 */     if (paramArrayOfString.length == 1) {
/* 107:125 */       return a(paramArrayOfString, xb.b());
/* 108:    */     }
/* 109:126 */     if ((paramArrayOfString.length > 1) && (paramArrayOfString.length <= 4)) {
/* 110:127 */       return a(paramArrayOfString, 1, paramdt);
/* 111:    */     }
/* 112:130 */     return null;
/* 113:    */   }
/* 114:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cv
 * JD-Core Version:    0.7.0.1
 */