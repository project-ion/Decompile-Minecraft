/*   1:    */ import com.google.common.collect.UnmodifiableIterator;
/*   2:    */ import java.util.Arrays;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.NoSuchElementException;
/*   5:    */ 
/*   6:    */ class ef
/*   7:    */   extends UnmodifiableIterator
/*   8:    */ {
/*   9: 76 */   private int a = -2;
/*  10:    */   private final Iterable[] b;
/*  11:    */   private final Iterator[] c;
/*  12:    */   private final Object[] d;
/*  13:    */   
/*  14:    */   private ef(Class paramClass, Iterable[] paramArrayOfIterable)
/*  15:    */   {
/*  16: 83 */     this.b = paramArrayOfIterable;
/*  17: 84 */     this.c = ((Iterator[])eb.a(Iterator.class, this.b.length));
/*  18: 85 */     for (int i = 0; i < this.b.length; i++) {
/*  19: 86 */       this.c[i] = paramArrayOfIterable[i].iterator();
/*  20:    */     }
/*  21: 88 */     this.d = eb.a(paramClass, this.c.length);
/*  22:    */   }
/*  23:    */   
/*  24:    */   private void b()
/*  25:    */   {
/*  26: 92 */     this.a = -1;
/*  27:    */     
/*  28: 94 */     Arrays.fill(this.c, null);
/*  29: 95 */     Arrays.fill(this.d, null);
/*  30:    */   }
/*  31:    */   
/*  32:    */   public boolean hasNext()
/*  33:    */   {
/*  34:100 */     if (this.a == -2)
/*  35:    */     {
/*  36:101 */       this.a = 0;
/*  37:102 */       for (Object localObject2 : this.c) {
/*  38:103 */         if (!localObject2.hasNext())
/*  39:    */         {
/*  40:104 */           b();
/*  41:105 */           break;
/*  42:    */         }
/*  43:    */       }
/*  44:108 */       return true;
/*  45:    */     }
/*  46:111 */     if (this.a >= this.c.length) {
/*  47:112 */       for (this.a = (this.c.length - 1); this.a >= 0; this.a -= 1)
/*  48:    */       {
/*  49:114 */         ??? = this.c[this.a];
/*  50:115 */         if (((Iterator)???).hasNext()) {
/*  51:    */           break;
/*  52:    */         }
/*  53:120 */         if (this.a == 0)
/*  54:    */         {
/*  55:121 */           b();
/*  56:122 */           break;
/*  57:    */         }
/*  58:126 */         ??? = this.b[this.a].iterator();
/*  59:127 */         this.c[this.a] = ???;
/*  60:130 */         if (!((Iterator)???).hasNext())
/*  61:    */         {
/*  62:131 */           b();
/*  63:132 */           break;
/*  64:    */         }
/*  65:    */       }
/*  66:    */     }
/*  67:136 */     return this.a >= 0;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public Object[] a()
/*  71:    */   {
/*  72:141 */     if (!hasNext()) {
/*  73:142 */       throw new NoSuchElementException();
/*  74:    */     }
/*  75:145 */     for (; this.a < this.c.length; this.a += 1) {
/*  76:146 */       this.d[this.a] = this.c[this.a].next();
/*  77:    */     }
/*  78:148 */     return (Object[])this.d.clone();
/*  79:    */   }
/*  80:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ef
 * JD-Core Version:    0.7.0.1
 */