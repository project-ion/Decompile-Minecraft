/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class cc
/*   4:    */   extends z
/*   5:    */ {
/*   6:    */   public String c()
/*   7:    */   {
/*   8: 19 */     return "particle";
/*   9:    */   }
/*  10:    */   
/*  11:    */   public int a()
/*  12:    */   {
/*  13: 24 */     return 2;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public String c(ae paramae)
/*  17:    */   {
/*  18: 29 */     return "commands.particle.usage";
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(ae paramae, String[] paramArrayOfString)
/*  22:    */   {
/*  23: 34 */     if (paramArrayOfString.length < 8) {
/*  24: 35 */       throw new dp("commands.particle.usage", new Object[0]);
/*  25:    */     }
/*  26: 38 */     int i = 0;
/*  27: 39 */     Object localObject1 = null;
/*  28: 40 */     for (Object localObject3 : ew.values()) {
/*  29: 41 */       if (localObject3.f())
/*  30:    */       {
/*  31: 42 */         if (paramArrayOfString[0].startsWith(localObject3.b()))
/*  32:    */         {
/*  33: 43 */           i = 1;
/*  34: 44 */           localObject1 = localObject3;
/*  35: 45 */           break;
/*  36:    */         }
/*  37:    */       }
/*  38: 47 */       else if (paramArrayOfString[0].equals(localObject3.b()))
/*  39:    */       {
/*  40: 48 */         i = 1;
/*  41: 49 */         localObject1 = localObject3;
/*  42: 50 */         break;
/*  43:    */       }
/*  44:    */     }
/*  45: 54 */     if (i == 0) {
/*  46: 55 */       throw new di("commands.particle.notFound", new Object[] { paramArrayOfString[0] });
/*  47:    */     }
/*  48: 58 */     ??? = paramArrayOfString[0];
/*  49: 59 */     brw localbrw = paramae.d();
/*  50: 60 */     double d1 = (float)b(localbrw.a, paramArrayOfString[1], true);
/*  51: 61 */     double d2 = (float)b(localbrw.b, paramArrayOfString[2], true);
/*  52: 62 */     double d3 = (float)b(localbrw.c, paramArrayOfString[3], true);
/*  53: 63 */     double d4 = (float)c(paramArrayOfString[4]);
/*  54: 64 */     double d5 = (float)c(paramArrayOfString[5]);
/*  55: 65 */     double d6 = (float)c(paramArrayOfString[6]);
/*  56: 66 */     double d7 = (float)c(paramArrayOfString[7]);
/*  57:    */     
/*  58: 68 */     int m = 0;
/*  59: 69 */     if (paramArrayOfString.length > 8) {
/*  60: 70 */       m = a(paramArrayOfString[8], 0);
/*  61:    */     }
/*  62: 73 */     boolean bool = false;
/*  63: 74 */     if ((paramArrayOfString.length > 9) && ("force".equals(paramArrayOfString[9]))) {
/*  64: 75 */       bool = true;
/*  65:    */     }
/*  66: 78 */     aqu localaqu = paramae.e();
/*  67: 79 */     if ((localaqu instanceof qt))
/*  68:    */     {
/*  69: 80 */       qt localqt = (qt)localaqu;
/*  70: 81 */       int[] arrayOfInt = new int[localObject1.d()];
/*  71: 82 */       if (localObject1.f())
/*  72:    */       {
/*  73: 83 */         String[] arrayOfString = paramArrayOfString[0].split("_", 3);
/*  74: 84 */         for (int n = 1; n < arrayOfString.length; n++) {
/*  75:    */           try
/*  76:    */           {
/*  77: 86 */             arrayOfInt[(n - 1)] = Integer.parseInt(arrayOfString[n]);
/*  78:    */           }
/*  79:    */           catch (NumberFormatException localNumberFormatException)
/*  80:    */           {
/*  81: 88 */             throw new di("commands.particle.notFound", new Object[] { paramArrayOfString[0] });
/*  82:    */           }
/*  83:    */         }
/*  84:    */       }
/*  85: 92 */       localqt.a(localObject1, bool, d1, d2, d3, m, d4, d5, d6, d7, arrayOfInt);
/*  86: 93 */       a(paramae, this, "commands.particle.success", new Object[] { ???, Integer.valueOf(Math.max(m, 1)) });
/*  87:    */     }
/*  88:    */   }
/*  89:    */   
/*  90:    */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/*  91:    */   {
/*  92:100 */     if (paramArrayOfString.length == 1) {
/*  93:101 */       return a(paramArrayOfString, ew.a());
/*  94:    */     }
/*  95:102 */     if ((paramArrayOfString.length > 1) && (paramArrayOfString.length <= 4)) {
/*  96:103 */       return a(paramArrayOfString, 1, paramdt);
/*  97:    */     }
/*  98:104 */     if (paramArrayOfString.length == 9) {
/*  99:105 */       return a(paramArrayOfString, new String[] { "normal", "force" });
/* 100:    */     }
/* 101:107 */     return null;
/* 102:    */   }
/* 103:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cc
 * JD-Core Version:    0.7.0.1
 */