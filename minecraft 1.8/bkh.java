/*   1:    */ import com.google.common.collect.Sets;
/*   2:    */ import java.util.LinkedList;
/*   3:    */ import java.util.Random;
/*   4:    */ import java.util.Set;
/*   5:    */ 
/*   6:    */ public class bkh
/*   7:    */   extends bmv
/*   8:    */ {
/*   9: 97 */   private Set c = Sets.newHashSet();
/*  10:    */   private boolean d;
/*  11:    */   
/*  12:    */   public bkh() {}
/*  13:    */   
/*  14:    */   public bkh(aqu paramaqu, Random paramRandom, int paramInt1, int paramInt2)
/*  15:    */   {
/*  16:106 */     super(paramInt1, paramInt2);
/*  17:107 */     b(paramaqu, paramRandom, paramInt1, paramInt2);
/*  18:    */   }
/*  19:    */   
/*  20:    */   private void b(aqu paramaqu, Random paramRandom, int paramInt1, int paramInt2)
/*  21:    */   {
/*  22:113 */     paramRandom.setSeed(paramaqu.J());
/*  23:114 */     long l1 = paramRandom.nextLong();
/*  24:115 */     long l2 = paramRandom.nextLong();
/*  25:116 */     long l3 = paramInt1 * l1;
/*  26:117 */     long l4 = paramInt2 * l2;
/*  27:118 */     paramRandom.setSeed(l3 ^ l4 ^ paramaqu.J());
/*  28:    */     
/*  29:120 */     int i = paramInt1 * 16 + 8 - 29;
/*  30:121 */     int j = paramInt2 * 16 + 8 - 29;
/*  31:122 */     ej localej = en.a.a(paramRandom);
/*  32:    */     
/*  33:124 */     this.a.add(new bkr(paramRandom, i, j, localej));
/*  34:125 */     c();
/*  35:    */     
/*  36:127 */     this.d = true;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*  40:    */   {
/*  41:132 */     if (!this.d)
/*  42:    */     {
/*  43:133 */       this.a.clear();
/*  44:134 */       b(paramaqu, paramRandom, e(), f());
/*  45:    */     }
/*  46:136 */     super.a(paramaqu, paramRandom, parambjb);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public boolean a(aqm paramaqm)
/*  50:    */   {
/*  51:141 */     if (this.c.contains(paramaqm)) {
/*  52:142 */       return false;
/*  53:    */     }
/*  54:144 */     return super.a(paramaqm);
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void b(aqm paramaqm)
/*  58:    */   {
/*  59:149 */     super.b(paramaqm);
/*  60:    */     
/*  61:151 */     this.c.add(paramaqm);
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void a(fn paramfn)
/*  65:    */   {
/*  66:156 */     super.a(paramfn);
/*  67:    */     
/*  68:158 */     fv localfv = new fv();
/*  69:159 */     for (aqm localaqm : this.c)
/*  70:    */     {
/*  71:160 */       fn localfn = new fn();
/*  72:161 */       localfn.a("X", localaqm.a);
/*  73:162 */       localfn.a("Z", localaqm.b);
/*  74:163 */       localfv.a(localfn);
/*  75:    */     }
/*  76:165 */     paramfn.a("Processed", localfv);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void b(fn paramfn)
/*  80:    */   {
/*  81:170 */     super.b(paramfn);
/*  82:172 */     if (paramfn.b("Processed", 9))
/*  83:    */     {
/*  84:173 */       fv localfv = paramfn.c("Processed", 10);
/*  85:174 */       for (int i = 0; i < localfv.c(); i++)
/*  86:    */       {
/*  87:175 */         fn localfn = localfv.b(i);
/*  88:176 */         this.c.add(new aqm(localfn.f("X"), localfn.f("Z")));
/*  89:    */       }
/*  90:    */     }
/*  91:    */   }
/*  92:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bkh
 * JD-Core Version:    0.7.0.1
 */